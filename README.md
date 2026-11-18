# cs2114-project3-group22

**Reflection**
Classes the new feature touched:
- The new feature implements a new class, Shop. To do so, we moved the methods that the controller calls from Line to Shop. Doing so required us adjusting Line and the creation of a new class, ShopController, which replaced LineController. The Driver was also adjusted to correctly declare and instantiate a Shop instead of a Line. We also needed a new button to add an order to the second line, which was added to the WindowView class.
Does the change cross the model/view line?
- No, the view still does not have direct access to the model and vice versa, and none of the model's logic is stored outside the three class files for the model.
What changed from the D3 plan?
- The D3 plan was vague and did not specify changes to the Driver and WindowView. Subtle changes to these classes were necessary to implement the Shop.

**Next Steps**
In order to get ready for the 3-minute demo, we want to reformat the visuals of how orders are displayed. We implemented our stretch goal of having multiple lines to represent different avenues of customers. In our 3-minute demo, we will show off how the program is intended to be used by demonstrating adding and removing orders, as well as demonstrating what will happen in the case of bad input, such as spamming the add order button or attempting to remove an order from an empty line. The primary work we need to do is create the slideshow. Rin will be responsible for adjusting how orders are displayed, and Ashna and Kaitlyn will be responsible for preparing the slideshow.

**How to run the test cases**
Our test cases are all stored under the Model folder and can be run in Eclipse using JUnit 4.

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

Shop: Rin Hall
Shop Controller: Rin Hall
LineTest: Ashna Velikath
- edited by Rin Hall
OrderTest: Kaitlyn Vasquez

GenAI Note: We did not use any GenAI for this phase of the project.
