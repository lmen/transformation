package viewComponents;

public interface Visitor<T> {

	public T enter(ViewWindowComponent comp);

	public T enter(ViewZoneComponent comp);

	public T enter(ViewOutputComponent comp);

	public T enter(ViewInputComponent comp);

	public T enter(ViewComponentNode viewInfo);

}
