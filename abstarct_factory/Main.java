package abstarct_factory;

public class Main {

	public static void main(String[] args) {

		ViewFactory viewFactory = FactoryCreator.createViewFactory("window");
		ButtonView buttonView = viewFactory.createButtonView();
		EditTextView editTextView = viewFactory.createEditTextView();
		
		buttonView.doButtonSomething();
		editTextView.doEditTextSomething();
		
		viewFactory = FactoryCreator.createViewFactory("linux");
		buttonView = viewFactory.createButtonView();
		editTextView = viewFactory.createEditTextView();

		buttonView.doButtonSomething();
		editTextView.doEditTextSomething();
	}

}
