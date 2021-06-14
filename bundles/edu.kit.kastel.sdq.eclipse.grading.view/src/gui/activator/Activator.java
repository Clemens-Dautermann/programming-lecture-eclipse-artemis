package gui.activator;

	import org.eclipse.ui.plugin.AbstractUIPlugin;
	import org.osgi.framework.BundleContext;

	/**
	 * The activator class controls the plug-in life cycle
	 */
	public class Activator extends AbstractUIPlugin {

		// The plug-in ID
		public static final String PLUGIN_ID = "plugin_gui"; //$NON-NLS-1$

		// The shared instance
		private static Activator plugin; 
		
		/**
		 * The constructor
		 */
		public Activator() {
		}

		@Override
		public void start(BundleContext context) throws Exception {
			System.out.println("   ######################################################################################################�ctivator was executed!!!!!!!!!-begin");
			
			System.out.println(context.toString());
			
			System.out.println("   ######################################################################################################Activator was executed!!!!!!!!!-end");
			super.start(context);
			plugin = this;
		}

		@Override
		public void stop(BundleContext context) throws Exception {
			plugin = null;
			super.stop(context);
		}

		/**
		 * Returns the shared instance
		 *
		 * @return the shared instance
		 */
		public static Activator getDefault() {
			return plugin;
		}

	}

