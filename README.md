# 3rd Compulsory Algorithm Hand in - Critical Path

My implementation for critical path was written in JAVA. I did not attempt to calculate drag.
## Walkthrough 

The project contains five classes:
 - [App.java](https://github.com/Ekskursantas/CAL3/blob/master/src/main/java/CriticalPath/CP/App.java)
 - [CriticalPath.java](https://github.com/Ekskursantas/CAL3/blob/master/src/main/java/CriticalPath/CP/CriticalPath.java)
 - [Path.java](https://github.com/Ekskursantas/CAL3/blob/master/src/main/java/CriticalPath/CP/Path.java)
 - [Setup.java](https://github.com/Ekskursantas/CAL3/blob/master/src/main/java/CriticalPath/CP/Setup.java)
 - [Task.java](https://github.com/Ekskursantas/CAL3/blob/master/src/main/java/CriticalPath/CP/Task.java)

**App.java** is the main class where the code is being initialized and where all the tasks/nodes are being created. We also calculate float inside of this class.

![App.java](https://github.com/Ekskursantas/CAL3/blob/master/Screenshot_2.png)

**CriticalPath.java** is the class where we calculate the critical path, but also we calculate all other possible paths and then we store all of them inside of a Path.java object ArrayList.

![CriticalPath.java](https://github.com/Ekskursantas/CAL3/blob/master/Screenshot_6.png)

**Path.java** is a class/object to store a possible paths nodes/tasks and total duration.
**Setup.java** is a class where we calculate the latest and earliest starts and finishes. Before we calculate the latest we have to calculate the earliest possible because we calculating the earliest by iterating from start to finish and we calculate the latest by iterating from finish to start. Because when we calculate the earliest we need the "start" task earliest start value before we can calculate any other task. 

![Earliest calculation](https://github.com/Ekskursantas/CAL3/blob/master/Screenshot_4.png)

For latest, we first need to calculate the latest finish of the "finish" task. And the latest finish is the earliest finish. By knowing that we first calculate the earliest.

![Latest calculation](https://github.com/Ekskursantas/CAL3/blob/master/Screenshot_5.png)

**Task.java** is a object which we create for every task and store all the calculated values.

## Output
![Output](https://github.com/Ekskursantas/CAL3/blob/master/Screenshot_10.png)
