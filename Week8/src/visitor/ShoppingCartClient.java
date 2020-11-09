package visitor;

// Source: https://www.geeksforgeeks.org/visitor-design-pattern/

/**
 * Client : The Client class is a consumer of the classes of the visitor design pattern. 
 * It has access to the data structure objects and can instruct them to accept a Visitor to perform the appropriate processing.
 * 
 * Visitor : This is an interface or an abstract class used to declare the visit operations for all the types of visitable classes.
 * 
 * ConcreteVisitor : For each type of visitor all the visit methods, 
 * declared in abstract visitor, must be implemented. Each Visitor will be responsible for different operations.
 * 
 * Visitable : This is an interface which declares the accept operation. 
 * This is the entry point which enables an object to be “visited” by the visitor object.
 * 
 * ConcreteVisitable : These classes implement the Visitable interface or class and defines the accept operation. 
 * The visitor object is passed to this object using the accept operation.
 */
class ShoppingCartClient  
{ 
   
    public static void main(String[] args)  
    { 
        ItemElement[] items = new ItemElement[]{new Book(20, "1234"), 
                              new Book(100, "5678"), new Fruit(10, 2, "Banana"), 
                              new Fruit(5, 5, "Apple")}; 
   
        int total = calculatePrice(items); 
        System.out.println("Total Cost = "+total); 
    } 
   
    private static int calculatePrice(ItemElement[] items)  
    { 
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl(); 
        int sum=0; 
        for(ItemElement item : items) 
        { 
            sum = sum + item.accept(visitor); 
        } 
        return sum; 
    } 
   
} 
