# Make a new Java file called Balloon.java, and write an equivalent of the following class:

class Balloon:
    """A Balloon that can be popped and inflated."""

    def __init__(self, color: str, capacity: int = 100) -> None:
        """Construct an inflated balloon of the given color
        and capacity. If no capacity is provided, the
        default is 100."""

        # When converting to Java: make these attributes private
        self.amount = 0
        self.capacity = capacity
        self.popped = False
        self.color = color

        # When converting to Java: make the capacity parameter optional
        # by making two different constructors, one with capacity, one without

    def getColor(self) -> int:
        """Return the color of this balloon."""

        return self.color
    
    def getAmount(self) -> int:
        """Return the amount of air in this balloon."""

        return self.amount

    def setAmount(self, amnt: int) -> int:
        """Set the amount of air in this balloon."""

        self.amount = amnt

    def setCapacity(self, amnt: int) -> int:
        """Set this balloon's total air capacity."""
        
        self.capacity = amnt
    
    def getCapacity(self) -> int:
        """Return this balloon's total air capacity."""
        
        return self.capacity

    def isPopped(self) -> bool:
        """Return whether or not this balloon is popped."""
        
        return self.popped

    def pop(self) -> None:
        """Pop this balloon."""

        self.setAmount(0)
        self.setCapacity(0)
        self.popped = True
        print("BOOM!")

    def addAir(self, a: int) -> None:
        """
        Inflate the balloon by the given amount a.
        If this inflation exceeds capacity, pop the balloon.
        If a is a negative number, nothing happens.
        """
        
        if not self.popped and a > 0:
            self.amount = self.amount + a;
            if self.amount > self.capacity:
                self.pop()

    # How to do this in Java? See course notes Section 3.3 (the last slide in this section)
    def __str__(self) -> str:
        """Return string representation of this balloon."""

        s = "Color:" + self.color + \
            ", Amount: " + str(self.amount) + \
            ", Capacity: " + str(self.capacity) + \
            ", Popped: " + str(self.popped)
        return s
