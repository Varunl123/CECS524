subroutine matsum(Matrix,Rows,Cols,Filled_Rows,Filled_Cols,Sum)
Integer,Intent(In)::Rows,Cols,Filled_Rows,Filled_Cols;
Real,Dimension(Rows,Cols), Intent(IN)::Matrix;
Real,Intent(Out)::Sum
Integer::Row_index,Col_Index
Sum=0.0
Do Row_Index=1,Filled_Rows	
	Do Col_Index=1,Filled_Cols		
		Sum=Sum+Matrix(Row_Index,Col_Index)
	End Do
END Do
End subroutine matsum
program AplLab
implicit none
Real, Dimension(3,3)::m1;
Real, Dimension(5,5)::m2;
Real  Sum;
m1(1,1)=1
m1(1,2)=2
m1(1,3)=3
m1(2,1)=4
m1(2,2)=5
m1(2,3)=6
m1(3,1)=7
m1(3,2)=8
m1(3,3)=9
m2(1,1)=1
m2(1,2)=2
m2(1,3)=3
m2(1,4)=4
m2(1,5)=5
m2(2,1)=7
m2(2,2)=3
m2(2,3)=3
m2(2,4)=5
m2(2,5)=3
m2(3,1)=3
m2(3,2)=4
m2(3,3)=5
m2(3,4)=9
m2(3,5)=7
m2(4,1)=4
m2(4,2)=8
m2(4,3)=6
m2(4,4)=8
m2(4,5)=8
m2(5,1)=5
m2(5,2)=7
m2(5,3)=7
m2(5,4)=4
m2(5,5)=9
call matsum(m1, 3, 3, 2, 3, Sum)
write(*,*)"Sum of M1:",sum
call matsum(m2, 5, 5, 5, 3, Sum)
write(*,*)"Sum of M2:",Sum
end


! The output I got is Sum1=21.00 and Sum2=68.00 . Since Fortran array storage is column-major. I have stored values assuming Fortran array storage is row major . So while assuming the matrix to be row major , the output seems to be wrong. But considering the values actually stored in the column major , the output is correct.