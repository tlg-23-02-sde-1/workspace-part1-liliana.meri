/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.javatunes.member;

public class SubMember extends Member {

    public SubMember() {
        // NOTE: there is a call to super() here! as the first line of code
        //goes all the way to member!
        super(); // add  super here as reminder that its here
        System.out.println("SubMember ctor");
    }
}