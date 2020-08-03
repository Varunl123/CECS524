WITH Ada.Text_IO;
WITH Ada.Integer_Text_IO;
use ada.text_io;
with ada.Text_IO;
use Ada.Text_IO;
with Ada.Strings.Unbounded; use Ada.Strings.Unbounded;
with Ada.Text_IO.Unbounded_IO; use Ada.Text_IO.Unbounded_IO;
with Ada.Integer_Text_IO; use Ada.Integer_Text_IO;
with Ada.Directories; use Ada.Directories;
PROCEDURE Test_Tower IS
SUBTYPE Pegs IS Character RANGE 'A'..'C';
Rings, Moves : Natural;
PROCEDURE MoveDisk( FromPeg, ToPeg : Pegs; Which : Natural) IS

BEGIN
Moves:=Moves+1;
put("Move  #");
put(moves);
put("  move Disk ");
put(which);
put("  from peg  ");
put(FromPeg);
put("  to ");
put(ToPeg);
Ada.Text_IO.New_Line;
--Put_Line("Move disk" & Natural'Image(Which) & " from " & Pegs'Image(FromPeg) & " to " & Pegs'Image(ToPeg));
END MoveDisk;

PROCEDURE Tower(FromPeg, ToPeg, AuxPeg: Pegs; N : Natural) IS

BEGIN
if n=1 then
MoveDisk(FromPeg,ToPeg,N);
else 
Tower(FromPeg, AuxPeg, ToPeg,N-1); 
MoveDisk(FromPeg,ToPeg,N);
Tower(AuxPeg, ToPeg, FromPeg,N-1); 
end if;
END Tower;

BEGIN
Moves:=0;
put("Enter number of rings:");
get(Rings);
Tower( 'A', 'B', 'C',Rings); 
END Test_Tower;