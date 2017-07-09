package viewComponents;

public class Visitor {

	public void enter(ViewWindowComponent comp) {
		System.out.println("specific enter viewInfo ViewWindowComponent ");
	}

	public void leave(ViewWindowComponent comp) {
		System.out.println("specif leave viewInfo ViewWindowComponent ");
	}

	public void enter(ViewComponentNode viewInfo) {
		System.out.println("GEN enter viewInfo: " + viewInfo.id);
	}

	public void leave(ViewComponentNode viewInfo) {
		System.out.println("GEN leave viewInfo: " + viewInfo.id);
	}

}
