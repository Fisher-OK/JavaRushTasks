package com.javarush.task.task21.task2104;

import java.util.HashSet;
import java.util.Set;

/* 
Equals and HashCode
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

//    public boolean equals(Solution n) {
//        if (n == null) return false;
//        if (this.getClass() != n.getClass()) return false;
//
//        return n.first.equals(first) && n.last.equals(last);
//    }
//
//    public int hashCode() {
//
//        return 31 * first.length() + last.length();
//    }


//    @Override
//    public int hashCode() {
//        return 31 * first.length() + last.length();
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) return false;
//        if (obj instanceof Solution) return true;
//        if (this == obj) return true;
//        return ((Solution) obj).first.equals(this.first) && ((Solution) obj).last.equals(this.last);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
//        if (o instanceof Solution) return true;

        Solution solution = (Solution) o;

        boolean firstP = (first != null) ? first.equals(solution.first) : solution.first == null;
        boolean lastP = (last != null) ? last.equals(solution.last) : solution.last == null;
         return firstP && lastP;

    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (last != null ? last.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}
