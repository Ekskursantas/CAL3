package CriticalPath.CP;

import java.util.ArrayList;

public class Path {

	ArrayList<Task> tasks = new ArrayList<Task>();
	Integer duration;
	Integer index;
	public Path(ArrayList<Task> tasks, Integer duration, Integer index) {
		this.tasks = tasks;
		this.duration = duration;
		this.index = index;
	}
	public ArrayList<Task> getTasks() {
		return this.tasks;
	}
	public void setTasks(ArrayList<Task> tasks) {
		this.tasks = tasks;
	}
	public Integer getDuration() {
		return this.duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public Integer getIndex() {
		return this.index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	
}
