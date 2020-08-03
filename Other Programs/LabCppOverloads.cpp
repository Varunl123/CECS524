//Varun Lingabathini

#include <iostream>
#include <string>
using namespace std;

class Account {
	int	accNum;
	float	balance;
	string  name;
public:
	Account(int an, string n, float b){
		accNum = an;
		name = n;
		balance = b;
	}
	int getAccount(){ return accNum;}
	string getName() { return name;}
	float getBalance() { return balance;}
	friend ostream& operator<<(ostream& os, const Account& account);
	friend bool operator==(const Account& account1,const Account& account2);
	friend bool operator!=(const Account& account1, const Account& account2);
//add ops
};
ostream& operator<<(ostream& os, const Account& account)
{
  return os << "Account#: " << account.accNum << " Name: " << account.name << " Balance: " << account.balance;
}
bool operator==(const Account& account1,const Account& account2){
 return (account1.accNum==account2.accNum) && (account1.name==account2.name) && (account1.balance==account2.balance);
}
bool operator!=(const Account& account1, const Account& account2){
    return (account1.accNum!=account2.accNum) && (account1.name!=account2.name) && (account1.balance!=account2.balance);
}
int main(){
	Account acc1 = Account(12345, "Smith", 1000);
	Account acc2 = Account(23445, "Jones", 300);
	
	cout<<acc1<< endl;
	cout<<acc2<< endl;
	if(acc1==acc2)
		cout<< "The same account in in both objects" << endl;
	else
		cout<< "Each object holds a different account" << endl;
	 
	acc2 = acc1;
	
	if(acc1!=acc2)
		cout<< "The objects are not equal" << endl;
	else
		cout<< "The objects are equal" << endl;
	
	return 0;
}
