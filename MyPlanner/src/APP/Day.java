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
	 */

	private String name; 
	private SinglyLinkedList Events; 
	private ArrayList<Event> events; 
	private ArrayList<Task> tasks; 

	public Day(String name) throws UnexpectedWeekDay{ 
		if (name == "Sunday" || name == "Monday" || name == "Tuesday"
			   || name == "Wednsday" || name == "Thursday" || name == "Friday" || name == "Saturday" ) { 
			this.name = name; 
		} else { 
			throw new UnexpectedWeekDay("Week day not found."); 
		}
		
		this.events = new ArrayList<>(); 
		this.tasks = new ArrayList<>(); 

	}
	

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
