package abstarct_factory;

public class WindowViewFactory implements ViewFactory {

	@Override
	public ButtonView createButtonView() {
		return new WindowButtonView();
	}

	@Override
	public EditTextView createEditTextView() {
		return new WindowEditTextView();
	}

}
