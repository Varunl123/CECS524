
WITH Ada.Text_IO;

PROCEDURE concurrent is
--create a TASK TYPE specification with two variables 
TASK TYPE SimpleTask (Message : Character; HowMany : Positive);
--the TASK BODY is just plain old Ada code
TASK BODY SimpleTask IS
BEGIN
	FOR Count IN 1..HowMany LOOP
		Ada.Text_IO.Put(Item=> "Hello from Task " & Message);
		Ada.Text_IO.New_Line;
		--delay(0.1);
		--Do something about interleaving here (your Task 3)
	END LOOP;
END SimpleTask;
--create a SimpleTask
Task_A : SimpleTask(Message => 'A', HowMany => 5);
Task_B : SimpleTask(Message => 'B', HowMany => 5);
Task_C : SimpleTask(Message => 'C', HowMany => 5);
--create task B and task C (your Task 1)
BEGIN -- CoOp
	--launch the task????? (your Task 2)
	NULL;
END concurrent;
