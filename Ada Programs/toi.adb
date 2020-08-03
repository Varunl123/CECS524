WITH Ada.Text_IO;
WITH Ada.Integer_Text_IO;
use ada.text_io;

PROCEDURE Test_Tower IS
SUBTYPE Pegs IS Character RANGE 'A'..'C';
Rings, Moves : Natural;
PROCEDURE MoveDisk( FromPeg, ToPeg : Pegs; Which : Natural) IS
BEGIN
Put_Line("Move disk" & Natural'Image(Which) & " from this " & Pegs'Image(FromPeg) & " to that " & Pegs'Image(ToPeg));
new_line;
END MoveDisk;

PROCEDURE Tower(FromPeg, ToPeg, AuxPeg: Pegs; N : Natural) IS
BEGIN
if n=1 then
MoveDisk(FromPeg,ToPeg,N);
else 
Tower(FromPeg, AuxPeg, ToPeg,N-1 ); 
MoveDisk(FromPeg,ToPeg,Rings);
Tower(AuxPeg, ToPeg, FromPeg,N-1 ); 
end if;
END Tower;

BEGIN
Ada.Text_IO.Put(Item => "Enter number of rings on tower:");
Ada.Integer_Text_IO.Get(Item => Rings);
Tower( 'A', 'C', 'B',Rings); 
Ada.Text_IO.Put("Number of moves");
Ada.Integer_Text_IO.Put(Moves);
END Test_Tower;