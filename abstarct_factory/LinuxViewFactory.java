package abstarct_factory;

public class LinuxViewFactory implements ViewFactory {

	@Override
	public ButtonView createButtonView() {
		return new LinuxButtonView();
	}

	@Override
	public EditTextView createEditTextView() {
		return new LinuxEditTextView();
	}

}
