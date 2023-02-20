/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import java.util.Arrays;

/**
 * Intended usage (by human):
 *  $ java TelevisionClientArgs <brand> <volume> <display>
 * 
 * Example:
 *  $ java TelevisionClientArgs Samsung 32 PLASMA
 *
 * GOAL:
 *  Create an instance of Television with the specifications (values) provided by the user.
 */
class TelevisionClientArgs {

    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        //TODO: enhance the usage note (and don't hardcode everything)
        //1. Supported brands are Samsung, Sony,...
        //2. Volume must be between 0 and 100
        //3. Supported displays are LED, OLED,...
        if (args.length < 3) {
            String usage = "Usage: java TelevisionClientArgs <brand> <volume> <display>";
            String example = "Example: java TelevisionClientArgs Samsung 32 PLASMA";

            String note1 = "Supported brands are: " + Arrays.toString(Television.VALID_BRANDS); // for arrays
            String note2 = String.format("Volume must be between " + Television.MIN_VOLUME + " and " + Television.MAX_VOLUME);
            String note3 = "Supported displays are: " + Arrays.toString(DisplayType.values());
            System.out.println(usage + "\n" + example + "\n" + note1 + "\n" + note2 + "\n" +  note3);
            System.out.println(example);
            System.out.println(note1);
            System.out.println(note2);
            System.out.println(note3);
            return;  // early return from main(), application exits
        }

        // at this point, you can safely proceed, because you got your arguments
        // first, let's just show that we got them
        System.out.println("You provided " + args.length + " arguments");

        // first, convert any string inputs to proper types
        String brand = args[0];
        int volume = Integer.parseInt(args[1]);
        DisplayType display = DisplayType.valueOf(args[2]);

        // now, create an instance of Television from these
        Television tv = new Television(brand, volume, display);

        System.out.println("Congratulations on your order!");
        System.out.println("Your custom Television is on its way!");
        System.out.println(tv); //toString() auto called
    }
}