package solidImplemented;

import solidImplemented.payment.PaymentManager;
import solidImplemented.restaurants.AllRestaurantsAvailable;
import solidImplemented.restaurants.OrderManager;
import solidImplemented.support.SupportBean;
import solidImplemented.support.SupportManager;

import java.util.Scanner;

public class SwiggyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AllRestaurantsAvailable allRestaurantsAvailable = new AllRestaurantsAvailable();
        OrderManager orderManager = new OrderManager();
        PaymentManager paymentManager = new PaymentManager();
        SupportManager supportManager = new SupportManager();
        SupportBean supportBean = new SupportBean();
        System.out.println("Hi Nikhil, Welcome to Swiggy");
        System.out.println("Please select any one of our services from the below options : ");
        System.out.println("1. List all Restaurants and order food on Swiggy");
        System.out.println("2. Swiggy Support Services");
        System.out.println("3. Quit the application");
        System.out.print("Enter Your Choice : ");
        int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    allRestaurantsAvailable.restaurantsList();
                    System.out.println("Select from below options If you want to Order From any Restaurant or Quit");
                    System.out.println("1. Order From a Restaurant");
                    System.out.println("2. quit");
                    int orderChoice = scan.nextInt();
                    if (orderChoice == 1) {
                        System.out.print("Enter The Name of the Restaurant you want to order from : ");
                        String restaurantName = scan.next();
                        System.out.println("Here are the dishes available from the " + restaurantName + " Outlet");
                        OrderManager.dishesInRestaurantList(restaurantName);
                        System.out.print("Please Enter the dish you want to order : ");
                        String dishName = scan.next();
                        Integer orderPrice = orderManager.dishPrice(dishName, restaurantName);
                        System.out.println("Your order Price is : " + orderPrice);
                        System.out.print("please enter the payment method for your order (only Debit, Credit and UPI payments are available) : ");
                        String paymentMethod = scan.next();
                        System.out.print("please enter your card Number or UPI id : ");
                        String cardNumber = scan.next();
                        paymentManager.payment(paymentMethod, orderPrice, cardNumber);
                    }
                    if (orderChoice == 2) {

                        System.out.println("Thanks for using Swiggy");
                    }
                    break;

                case 2:
                    System.out.println("select from the below options to proceed further and get in touch with our support team : ");
                    System.out.println("1. General Support Query");
                    System.out.println("2. Order Support Query");
                    System.out.println("3. quit the application ");
                    //int supportChoice = scan.nextInt();
                    supportBean.setChoice(scan.nextInt());
                    if (supportBean.getChoice() == 1) {
                        System.out.print(" please enter the mail id / phone number for the support team to get back to you : ");
                    }
                    if (supportBean.getChoice()  == 2) {
                        System.out.println(" do you want to know the delivery guy details  : Y/N");
                        char deliveryDetails = scan.next().charAt(0);
                        if (deliveryDetails == 'Y' || deliveryDetails == 'y') {
                            supportBean.setChoice(4);
                            System.out.print(" please enter your order id : ");
                        } else {
                            System.out.print(" please enter the mail id / phone number for the support team to get back to you : ");
                        }
                    }
                    if(supportBean.getChoice()  == 3)
                    {
                        System.out.println(" Thanks for using Swiggy...!!!!");
                        break;
                    }
                    //String medium = scan.next();
                    supportBean.setMedium(scan.next());
                    scan.nextLine();
                    System.out.print(" please enter the message you want to send to support team : ");
                    //String message = scan.nextLine();
                    supportBean.setMessage(scan.nextLine());
                    supportManager.support(supportBean);
                    break;

                case 3:
                    System.out.println("Thanks for using Swiggy...!!!");
                    break;

                default:
                    System.out.println("Invalid Input");
                    break;
            }

        }
    }
