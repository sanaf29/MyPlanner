package APP;
import java.util.ArrayList;
import Structure.*; 
import EXP.UnexpectedWeekDay;

public class Day implements CalendarComponents {
	/**
	 * The Day class represents one day within the week.
	 * Each Day holds a list of events (time-specific activities)
	 * and a list of tasks (to-do items without specific times).
	 *
	 * Responsibilities:
	 * - Store, add, and remove events and tasks for the day.
	 * - Display the full schedule of events and pending tasks.
	 * - Maintain separation between timed events and general tasks.
	 *
	 * Each Day is linked to a specific name (e.g., "Monday")
	 * and acts as the central unit for daily scheduling.
	 * 
	 * 
	 * for the events, we have two structure ,first list of the events ,second the linkedList of the events
	 */

	private String name; 
	private SinglyLinkedList Events; 
	private ArrayList<Event> events; 
	private ArrayList<Task> tasks;
	private String taskStatus; 
	private String eventStatus; 
	private int eventnum; 
	private int tasknum; 

	public Day(String name) throws UnexpectedWeekDay{ 
		if (name == "Sunday" 
			   || name == "Monday" || name == "Tuesday"
			   || name == "Wednsday" || name == "Thursday" 
			   || name == "Friday" || name == "Saturday" ) { 
			
			this.name = name; 
			
		} else { 
			throw new UnexpectedWeekDay("Week day not found."); 
		}
		
		this.events = new ArrayList<>(); 
		this.tasks = new ArrayList<>(); 
		this.Events = new SinglyLinkedList();
		this.taskStatus = ""; 
		this.eventStatus = "";
		this.eventnum = 0;
		this.tasknum = 0; 

	}
	
	public void addEvent(Event e) {	
	    Event newEvent = new Event (e); 
	    this.events.add(newEvent); 
	    
	}
	public void addTask(Task t) { 
		
	}
	
	public void removeTask(Task t) { 
		
	}
	
	public void removeEvent(Event e) { 
		
	}
	
	public void updateTaskStatus() { 
		if ( this.tasks == null) { 
			this.taskStatus = "N/A"; 
		} else { 
			for ( int i = 0 ; i <this.tasknum ; i++ ) { 
				this.taskStatus += tasks[i].toString
			}
		}
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	public String toString() { 
		return null; 
		
		String s = "Events on " +  this.name + "Tasks are " + 
	}
	
	
	
}
