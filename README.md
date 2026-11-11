# cs2114-project3-group22

**Reflection**
What changed from the spec?
- We moved some of the validation around. Originally, WindowView was going to validate for too many inputs, but now that is split between WindowView and LineController. onRemoveClicked() and onAddClicked() passes a boolean as a parameter that lets the controller know whether or not the execute the function. We chose to do this because our old approach, which was to make it so that onRemoveClicked() and onAddClicked() would not be called if the validation didn't pass, was not possible given how JButtons work. 
- Line also got a few more fields and methods to make it able to communicate with and hold the necessary observers for an MVC. This was a necessity in order for the MVC to function.
- Lastly, WindowView got a few more fields that help with the display, such as titleFont and orderFont, which we chose to add in order to make the view more visually appealing and keep the code cleaner, since we use these fonts in multiple places.

Does the model stand alone?
- Yes, the model is fully functional by itself, it only needs to be told when to add/remove orders.

Unknowns
- We have figured out how to randomize orders. Each order has a list of possible options that it randomly selects from, and randomly determines a price between 1.50 and 15.00.
- We have not added different queues with different priorities, and as such have not decided on an algorithm for how to prioritize different queues.

**Next Steps**
The MVP is currently finished. The main work we need to do now is to finish all the test cases and ensure the program will not crash, and then work on our stretch goal of adding multiple queues. This will likely cause the creation of a new class which will manage observers, moving addObserver() and notifyObservers() from Line to whatever this new class, likely called Store, would be. It would have a few methods such as prioritizeLine() to decide which line to prioritize the order from next, as well as addLine(), removeLine(), and a toString method to show what lines it is currently storing. It will need tests to ensure this is working, and will probably be built off of an ArrayList<>. 
Arjun, Ashna, and Kaitlyn will handle adding the required test cases. Rin will handle adding the Store class and implementing the requisite changes to other classes.

**Attribution**
Driver: Rin Hall
LineController: Ashna Velikath
- edited by Rin Hall
Line: Ashna Velikath
- edited by Rin Hall
Order: Kaitlyn Vasquez
ConsoleView: Rin Hall
Observer: Rin Hall
WindowView: Rin Hall

GenAI Note: We did not use any GenAI for this phase of the project.