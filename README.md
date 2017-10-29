Some problems can occure.

1. Exception "No persistence provider for entitymanager named demo".
    
    If you launch the project in IntellijIDEA then to solve the problem you should check that the folder resources is 
    marked as Resources Root. Not META-INF or something else.
   
2. Exception "java.lang.ClassNotFoundException: javax.xml.bind.JAXBException".

    The problem is almost broken me) But decision is quite easy. I used JDK 9.0.1. And nevertheless I set language 
    level to Java 8 the problem still was. So I changed JDK to JDK 1.8.0_151 (the last for that moment) and it solved
    the problem. 
    I don't trust Java 9 anymore.