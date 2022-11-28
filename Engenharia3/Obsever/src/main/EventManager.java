package main;
import java.util.ArrayList;
import java.util.List;


public class EventManager {
private List<EventListener> listeners = new ArrayList<EventListener>();
	
	public void subscribe(EventListener listener) {
		listeners.add(listener);
	}
	
	public void unsubscribe(EventListener listener) {
		listeners.remove(listener);
	}
	
	public void notify(EventListener typeListener, String message) {
		for (EventListener listener : listeners) {
			if(listener.getClass().equals(typeListener.getClass()))
				listener.update(message);
		}
	}
}
