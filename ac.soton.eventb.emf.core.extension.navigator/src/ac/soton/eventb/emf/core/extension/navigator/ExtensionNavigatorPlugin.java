/*******************************************************************************
 * Copyright (c) 2011, 2017 University of Southampton.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    University of Southampton - initial API and implementation
 *******************************************************************************/
package ac.soton.eventb.emf.core.extension.navigator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eventb.emf.core.context.provider.ContextItemProviderAdapterFactory;
import org.eventb.emf.core.machine.provider.MachineItemProviderAdapterFactory;
import org.eventb.emf.core.provider.CoreItemProviderAdapterFactory;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 * 
 * @author vitaly
 *
 */
public class ExtensionNavigatorPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "ac.soton.eventb.emf.core.extension.navigator"; //$NON-NLS-1$

	private static final String FACTORIES_EXTENSION_ID = "ac.soton.eventb.emf.core.extension.navigator.adapterFactories";
	private static final String EMFMODELS_EXTENSION_ID = "ac.soton.eventb.emf.core.extension.navigator.emfFileExtensions";
	
	// The shared instance
	private static ExtensionNavigatorPlugin plugin;

	private ComposedAdapterFactory adapterFactory;
	
	private List<String> emfFileExtensions;
	
	/**
	 * The constructor
	 */
	public ExtensionNavigatorPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		adapterFactory = createAdapterFactory();
		emfFileExtensions = createEmfFileExtensions();
	}

	/**
	 * @return
	 */
	private List<String> createEmfFileExtensions() {
		List<String> ret = new ArrayList<String>();
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(EMFMODELS_EXTENSION_ID);
		for (IConfigurationElement element : config) {
			String fext = element.getAttribute("extension");
			if (fext!=null && fext.length()>0)
			ret.add(fext);	
		}
		return ret;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		adapterFactory.dispose();
		adapterFactory = null;
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static ExtensionNavigatorPlugin getDefault() {
		return plugin;
	}

	protected ComposedAdapterFactory createAdapterFactory() {
		ArrayList<AdapterFactory> factories = new ArrayList<AdapterFactory>();
		fillItemProviderFactories(factories);
		fillExtensionProviderFactories(factories);
		return new ComposedAdapterFactory(factories);
	}

	/**
	 * Fills adapter factories from extensions of the 'factories' extension point.
	 * 
	 * @param factories a collection to store the factories from extensions
	 */
	private void fillExtensionProviderFactories(ArrayList<AdapterFactory> factories) {
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(FACTORIES_EXTENSION_ID);
		for (IConfigurationElement element : config) {
			try {
				final Object extension = element.createExecutableExtension("class");
				if (extension instanceof ComposeableAdapterFactory) {
					factories.add((ComposeableAdapterFactory) extension);
				}
			} catch (CoreException e) {
				getLog().log(new Status(Status.ERROR, PLUGIN_ID, "Failed to create executable extension of " + element.getAttribute("class"), e));
			}
		}
	}

	/**
	 * Fills the standard adapter factories for EMF and Event-B elements.
	 * 
	 * @param factories a collection to store the factories
	 */
	protected void fillItemProviderFactories(List<AdapterFactory> factories) {
		factories.add(new EcoreItemProviderAdapterFactory());
		factories.add(new CoreItemProviderAdapterFactory());
		factories.add(new MachineItemProviderAdapterFactory());
		factories.add(new ContextItemProviderAdapterFactory());
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new ReflectiveItemProviderAdapterFactory());
	}

	/**
	 * Returns composed item provider adapter factory.
	 * 
	 * @return factory
	 */
	public AdapterFactory getItemProvidersAdapterFactory() {
		return adapterFactory;
	}

	/**
	 * Returns list of file extensions for EMF models to be shown in navigator.
	 * 
	 * @return factory
	 */
	public List<String> getEmfFileExtensions() {
		return emfFileExtensions;
	}
	
}
