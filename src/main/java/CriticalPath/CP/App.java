package CriticalPath.CP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App {

	public static ArrayList<Task> tasks = new ArrayList<Task>();

	public static void main(String[] args) {
		addTasks();
		Setup setup = new Setup();
		setup.setUpForwardTime();
		System.out.println("Earliest Start and Finish");
		for (Task string : tasks) {
			System.out.println(string.getTask() + " " + string.getES() + " " + string.getEF());
		}
		setup.setUpBackwardTime();

		System.out.println("Latest Start and Finish");
		for (Task string : tasks) {
			System.out.println(string.getTask() + " " + string.getLS() + " " + string.getLF());
		}
		CriticalPath getPath = new CriticalPath();
		getPath.calculateCriticalPath(tasks.get(0));
		ArrayList<Path> paths = getPath.getPaths();
		Path critPath = getPath.getCriticalPath();
		String string = "[";
		for (Task path : critPath.tasks) {
			string += "-"+path.getTask();
		}
		string += "-]";
		System.out.println("Duration: " + critPath.duration + " " + string);
		calculateFloat(critPath);
		for (Task path : tasks) {
			System.out.println("Float: " + path.getTask() + " " + path.getTaskFloat());
		}

	}

	

	public static void calculateFloat(Path t) {
		Set<Task> container = new HashSet<Task>();
		container.addAll(t.getTasks());
		for (Task task : tasks) {
			if(!container.contains(task)) {
				task.setTaskFloat(task.getLF() - task.getEF());
			}
		}
	}

	public static void addTasks() {

		Task end = new Task(1, "end", null); // it is required to be named as "end" because in the setup class we use the "end" string to make sure we set the values before we calculate "latest" values.
		Task task_e = new Task(5, "E", new Task[] { end });
		Task task_d = new Task(25, "D", new Task[] { task_e });
		Task task_c = new Task(15, "C", new Task[] { task_d });
		Task task_b = new Task(10, "B", new Task[] { task_c });
		Task task_k = new Task(5, "K", new Task[] { end });
		Task task_v = new Task(25, "V", new Task[] {end});
		Task start = new Task(10, "start", new Task[] { task_b, task_k, task_v }); // same as "end" just for "earliest" values

		tasks.add(start);
		tasks.add(task_b);
		tasks.add(task_c);
		tasks.add(task_d);
		tasks.add(task_e);
		tasks.add(task_k);
		tasks.add(task_v);
		tasks.add(end);
	}
}