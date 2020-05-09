package abstarct_factory;

public class FactoryCreator {
	
	static ViewFactory createViewFactory(String OS) {
		if (OS.equals("window")) {
			return new WindowViewFactory();
		} else if (OS.equals("linux")){
			return new LinuxViewFactory();
		} else {
			return null;
		}
	}
}
