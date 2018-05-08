package CriticalPath.CP;

import java.util.ArrayList;

public class Task {

	private Integer ES;
	private Integer EF;
	private Integer LS;
	private Integer LF;
	private Integer duration;
	private String task;
	private Task[] forwardRelations;
	private ArrayList<Task> backwardRelations = new ArrayList<Task>();
	private Integer taskFloat = 0;
	
	public Task(Integer duration, String task, Task[] forwardRelations) 
	{
		this.task = task;
		this.duration = duration;
		this.forwardRelations = forwardRelations;
	}
	public Integer getTaskFloat() {
		return taskFloat;
	}
	public void setTaskFloat(Integer taskFloat) {
		this.taskFloat = taskFloat;
	}
	public Task(Integer eS, Integer eF, Integer lS, Integer lF, Integer duration, String task) {
		this.ES = eS;
		this.EF = eF;
		this.LS = lS;
		this.LF = lF;
		this.duration = duration;
		this.task = task;
	}

	public ArrayList<Task> getBackwardRelations() {
		return backwardRelations;
	}
	public void setBackwardRelations(ArrayList<Task> backwardRelations) {
		this.backwardRelations = backwardRelations;
	}
	public void addBackwardRelations(Task t) {
		this.backwardRelations.add(t);
	}
	public Task[] getForwardRelations() {
		return forwardRelations;
	}
	public void setForwardRelations(Task[] forwardRelations) {
		this.forwardRelations = forwardRelations;
	}
	public Integer getES() {
		return ES;
	}

	public void setES(Integer eS) {
		ES = eS;
	}

	public Integer getEF() {
		return EF;
	}

	public void setEF(Integer eF) {
		EF = eF;
	}

	public Integer getLS() {
		return LS;
	}

	public void setLS(Integer lS) {
		LS = lS;
	}

	public Integer getLF() {
		return LF;
	}

	public void setLF(Integer lF) {
		LF = lF;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}
	
	
	
}
