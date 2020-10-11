JFLAGS = -g -classpath
JC = javac
JCPATH = java
INTERFACE = Node.class Structure.class
STRUCTURE = Linked_list.class
NODE = Node.class

.SUFFIXES: .java .class
Linked_list: Node.class Linked_list.java
	$(JC) $(JFLAGS) $(JCPATH) Linked_list.java
Node.class: Node.java
	$(JC) $(JFLAGS) $(JCPATH) Node.java
Application.class: $(INTERFACE) $(NODE) $(STRUCTURE)
	$(JC) $(JFLAGS) $(JCPATH) Application.java
