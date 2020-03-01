//designpatterns.state.AccountState.java
package designpatterns.state;

//³éÏó×´Ì¬Àà
public abstract class AccountState {
	protected Account acc;
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract void computeInterest();
	public abstract void stateCheck();
}