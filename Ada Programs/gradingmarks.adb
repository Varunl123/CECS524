with ada.Text_IO;
use Ada.Text_IO;
with Ada.Strings.Unbounded; use Ada.Strings.Unbounded;
with Ada.Text_IO.Unbounded_IO; use Ada.Text_IO.Unbounded_IO;
with Ada.Integer_Text_IO; use Ada.Integer_Text_IO;
with Ada.Directories; use Ada.Directories;
procedure gradingmarks is 
	fname: unbounded_string;
	sline: unbounded_string;
	subjects:Integer;
	count:Integer;
	temp:Integer;
	File: File_Type;
	sum:Integer;
	n: Integer;
	frequencyArray:array(1..100) of integer;
	nameOk: boolean:=false;
	type myArray is array(Integer range<>) of Integer;
	type newArray is array(Integer range<>) of Integer;
	type array1 is array(Integer range<>) of Integer;
	
	function compute(a:myArray;b:newArray) return Integer is 
	count:Integer;
	mul:Integer;
	begin	
	mul:=100/subjects;
	count:=0;
		for I in 1..subjects loop
			if a(I)=b(I+1) then
				count:=count+1;
			end if;
		end loop;
			return count*mul;
	end compute;
	
	
	
	
	
	
	
	
	
	begin
		
		loop	
			exit when nameOk;
			Put_Line("Enter the filename:");
			get_line(fname);
			nameOk:= exists(to_string(fname));
			if(nameOk=false)then 
			put_line("Enter an exisiting file!");
				Ada.Text_IO.New_Line;
			end if;
		end loop;
		open(File, in_file, to_string(fname));
		count:=0;
		loop	
			exit when end_of_file(File);
				get_line(File,sline);
				count:=count+1;
				
			end loop;
			
		Close(File);
		--put(count);
		--Ada.Text_IO.New_Line;
		open(File, in_file, to_string(fname));
		get(File,subjects);
		--put(subjects);
		--Ada.Text_IO.New_Line;
		declare
			key: myArray(0..subjects);
			response1:newArray(0..subjects+1);
			frequency:array1(0..count-2);
		begin 	
		for I in 1..subjects loop
			get(File,n);
			key(I):=n;
		end loop;
		--Ada.Text_IO.New_Line;
		put_line("Student ID      Score");
		Ada.Text_IO.New_Line;
		put_line("===============================");
		
		
		
		--reading 
		
		for I in 1..count-2 loop
		
			for J in 1..subjects+1 loop
				get(File,n);
				response1(J):=n;
			end loop;
			
			frequency(I):=compute(key,response1);
			put(response1(1));
			put(frequency(I));
			Ada.Text_IO.New_Line;
			Ada.Text_IO.New_Line;
			
		end loop;
		put_line("================================");
		Ada.Text_IO.New_Line;
		put("Tests graded = ");
		put(count-2);
		Ada.Text_IO.New_Line;
		put_line("================================");
		Ada.Text_IO.New_Line;
		put_line("Score              Frequency");
		Ada.Text_IO.New_Line;
		put_line("================================");
		--Ada.Text_IO.New_Line;
		frequencyArray:=(1..100 => 0);
			sum:=0;
		for I in 1..count-2 loop
			temp:=frequencyArray(frequency(I));
			sum:=sum+frequency(I);
			if (temp=0)then
				frequencyArray(frequency(I)):=1;
			else
				frequencyArray(frequency(I)):=temp+1;
			end if;
		end loop;
	
		for I in reverse 1..100 loop
			if(frequencyArray(I)>0)then	
				put(I);
				put("    ");
				put(frequencyArray(I));
				Ada.Text_IO.New_Line;
			end if;
			
		end loop;
		put_line("================================");
		Ada.Text_IO.New_Line;
		put("Class Average  =  ");
		put(sum/(count-2));	
		end;
		Close(File);
		
	end gradingmarks;