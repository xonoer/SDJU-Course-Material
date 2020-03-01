//designpatterns.memento.MementoCaretaker.java
package designpatterns.memento;

import java.util.*;
/*
//象棋棋子备忘录管理类：负责人
public class MementoCaretaker {
	private ChessmanMemento memento;

	public ChessmanMemento getMemento() {
		return memento;
	}

	public void setMemento(ChessmanMemento memento) {
		this.memento = memento;
	}
}
*/

public class MementoCaretaker {
    //定义一个集合来存储多个备忘录
	private ArrayList<ChessmanMemento> mementolist = new ArrayList<ChessmanMemento>();

	public ChessmanMemento getMemento(int i) {
		return (ChessmanMemento)mementolist.get(i);
	}

	public void setMemento(ChessmanMemento memento) {
		mementolist.add(memento);
	}
}