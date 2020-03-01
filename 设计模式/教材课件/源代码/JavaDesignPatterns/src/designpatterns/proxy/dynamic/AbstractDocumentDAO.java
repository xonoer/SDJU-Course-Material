//designpatterns.proxy.dynamic.AbstractDocumentDAO.java
package designpatterns.proxy.dynamic;

//抽象DocumentDAO：抽象主题角色
public interface AbstractDocumentDAO {
	public Boolean deleteDocumentById(String documentId);
}