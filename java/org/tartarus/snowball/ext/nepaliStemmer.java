// This file was generated automatically by the Snowball to Java compiler
// http://snowballstem.org/

package org.tartarus.snowball.ext;

import org.tartarus.snowball.Among;

 /**
  * This class was automatically generated by a Snowball to Java compiler
  * It implements the stemming algorithm defined by a snowball script.
  */

public class nepaliStemmer extends org.tartarus.snowball.SnowballStemmer {

    private static final long serialVersionUID = 1L;

private final static Among a_0[] = {
    new Among("\u0932\u093E\u0907", -1, 1),
    new Among("\u0932\u093E\u0908", -1, 1),
    new Among("\u0938\u0901\u0917", -1, 1),
    new Among("\u0938\u0902\u0917", -1, 1),
    new Among("\u092E\u093E\u0930\u094D\u092B\u0924", -1, 1),
    new Among("\u0930\u0924", -1, 1),
    new Among("\u0915\u093E", -1, 2),
    new Among("\u092E\u093E", -1, 1),
    new Among("\u0926\u094D\u0935\u093E\u0930\u093E", -1, 1),
    new Among("\u0915\u093F", -1, 2),
    new Among("\u092A\u091B\u093F", -1, 1),
    new Among("\u0915\u0940", -1, 2),
    new Among("\u0932\u0947", -1, 1),
    new Among("\u0915\u0948", -1, 2),
    new Among("\u0938\u0901\u0917\u0948", -1, 1),
    new Among("\u092E\u0948", -1, 1),
    new Among("\u0915\u094B", -1, 2)
};

private final static Among a_1[] = {
    new Among("\u0901", -1, -1),
    new Among("\u0902", -1, -1),
    new Among("\u0948", -1, -1)
};

private final static Among a_2[] = {
    new Among("\u0901", -1, 1),
    new Among("\u0902", -1, 1),
    new Among("\u0948", -1, 2)
};

private final static Among a_3[] = {
    new Among("\u0925\u093F\u090F", -1, 1),
    new Among("\u091B", -1, 1),
    new Among("\u0907\u091B", 1, 1),
    new Among("\u090F\u091B", 1, 1),
    new Among("\u093F\u091B", 1, 1),
    new Among("\u0947\u091B", 1, 1),
    new Among("\u0928\u0947\u091B", 5, 1),
    new Among("\u0939\u0941\u0928\u0947\u091B", 6, 1),
    new Among("\u0907\u0928\u094D\u091B", 1, 1),
    new Among("\u093F\u0928\u094D\u091B", 1, 1),
    new Among("\u0939\u0941\u0928\u094D\u091B", 1, 1),
    new Among("\u090F\u0915\u093E", -1, 1),
    new Among("\u0907\u090F\u0915\u093E", 11, 1),
    new Among("\u093F\u090F\u0915\u093E", 11, 1),
    new Among("\u0947\u0915\u093E", -1, 1),
    new Among("\u0928\u0947\u0915\u093E", 14, 1),
    new Among("\u0926\u093E", -1, 1),
    new Among("\u0907\u0926\u093E", 16, 1),
    new Among("\u093F\u0926\u093E", 16, 1),
    new Among("\u0926\u0947\u0916\u093F", -1, 1),
    new Among("\u092E\u093E\u0925\u093F", -1, 1),
    new Among("\u090F\u0915\u0940", -1, 1),
    new Among("\u0907\u090F\u0915\u0940", 21, 1),
    new Among("\u093F\u090F\u0915\u0940", 21, 1),
    new Among("\u0947\u0915\u0940", -1, 1),
    new Among("\u0926\u0947\u0916\u0940", -1, 1),
    new Among("\u0925\u0940", -1, 1),
    new Among("\u0926\u0940", -1, 1),
    new Among("\u091B\u0941", -1, 1),
    new Among("\u090F\u091B\u0941", 28, 1),
    new Among("\u0947\u091B\u0941", 28, 1),
    new Among("\u0928\u0947\u091B\u0941", 30, 1),
    new Among("\u0928\u0941", -1, 1),
    new Among("\u0939\u0930\u0941", -1, 1),
    new Among("\u0939\u0930\u0942", -1, 1),
    new Among("\u091B\u0947", -1, 1),
    new Among("\u0925\u0947", -1, 1),
    new Among("\u0928\u0947", -1, 1),
    new Among("\u090F\u0915\u0948", -1, 1),
    new Among("\u0947\u0915\u0948", -1, 1),
    new Among("\u0928\u0947\u0915\u0948", 39, 1),
    new Among("\u0926\u0948", -1, 1),
    new Among("\u0907\u0926\u0948", 41, 1),
    new Among("\u093F\u0926\u0948", 41, 1),
    new Among("\u090F\u0915\u094B", -1, 1),
    new Among("\u0907\u090F\u0915\u094B", 44, 1),
    new Among("\u093F\u090F\u0915\u094B", 44, 1),
    new Among("\u0947\u0915\u094B", -1, 1),
    new Among("\u0928\u0947\u0915\u094B", 47, 1),
    new Among("\u0926\u094B", -1, 1),
    new Among("\u0907\u0926\u094B", 49, 1),
    new Among("\u093F\u0926\u094B", 49, 1),
    new Among("\u092F\u094B", -1, 1),
    new Among("\u0907\u092F\u094B", 52, 1),
    new Among("\u092D\u092F\u094B", 52, 1),
    new Among("\u093F\u092F\u094B", 52, 1),
    new Among("\u0925\u093F\u092F\u094B", 55, 1),
    new Among("\u0926\u093F\u092F\u094B", 55, 1),
    new Among("\u0925\u094D\u092F\u094B", 52, 1),
    new Among("\u091B\u094C", -1, 1),
    new Among("\u0907\u091B\u094C", 59, 1),
    new Among("\u090F\u091B\u094C", 59, 1),
    new Among("\u093F\u091B\u094C", 59, 1),
    new Among("\u0947\u091B\u094C", 59, 1),
    new Among("\u0928\u0947\u091B\u094C", 63, 1),
    new Among("\u092F\u094C", -1, 1),
    new Among("\u0925\u093F\u092F\u094C", 65, 1),
    new Among("\u091B\u094D\u092F\u094C", 65, 1),
    new Among("\u0925\u094D\u092F\u094C", 65, 1),
    new Among("\u091B\u0928\u094D", -1, 1),
    new Among("\u0907\u091B\u0928\u094D", 69, 1),
    new Among("\u090F\u091B\u0928\u094D", 69, 1),
    new Among("\u093F\u091B\u0928\u094D", 69, 1),
    new Among("\u0947\u091B\u0928\u094D", 69, 1),
    new Among("\u0928\u0947\u091B\u0928\u094D", 73, 1),
    new Among("\u0932\u093E\u0928\u094D", -1, 1),
    new Among("\u091B\u093F\u0928\u094D", -1, 1),
    new Among("\u0925\u093F\u0928\u094D", -1, 1),
    new Among("\u092A\u0930\u094D", -1, 1),
    new Among("\u0907\u0938\u094D", -1, 1),
    new Among("\u0925\u093F\u0907\u0938\u094D", 79, 1),
    new Among("\u091B\u0938\u094D", -1, 1),
    new Among("\u0907\u091B\u0938\u094D", 81, 1),
    new Among("\u090F\u091B\u0938\u094D", 81, 1),
    new Among("\u093F\u091B\u0938\u094D", 81, 1),
    new Among("\u0947\u091B\u0938\u094D", 81, 1),
    new Among("\u0928\u0947\u091B\u0938\u094D", 85, 1),
    new Among("\u093F\u0938\u094D", -1, 1),
    new Among("\u0925\u093F\u0938\u094D", 87, 1),
    new Among("\u091B\u0947\u0938\u094D", -1, 1),
    new Among("\u0939\u094B\u0938\u094D", -1, 1)
};



private boolean r_remove_category_1() {
    int among_var;
    // (, line 53
    // [, line 54
    ket = cursor;
    // substring, line 54
    among_var = find_among_b(a_0);
    if (among_var == 0)
    {
        return false;
    }
    // ], line 54
    bra = cursor;
    switch (among_var) {
        case 0:
            return false;
        case 1:
            // (, line 58
            // delete, line 58
            slice_del();
            break;
        case 2:
            // (, line 59
            // or, line 59
            lab0: do {
                int v_1 = limit - cursor;
                lab1: do {
                    // (, line 59
                    // or, line 59
                    lab2: do {
                        int v_2 = limit - cursor;
                        lab3: do {
                            // literal, line 59
                            if (!(eq_s_b("\u090F")))
                            {
                                break lab3;
                            }
                            break lab2;
                        } while (false);
                        cursor = limit - v_2;
                        // literal, line 59
                        if (!(eq_s_b("\u0947")))
                        {
                            break lab1;
                        }
                    } while (false);
                    // (, line 59
                    break lab0;
                } while (false);
                cursor = limit - v_1;
                // delete, line 59
                slice_del();
            } while (false);
            break;
    }
    return true;
}

private boolean r_check_category_2() {
    // (, line 63
    // [, line 64
    ket = cursor;
    // substring, line 64
    if (find_among_b(a_1) == 0)
    {
        return false;
    }
    // ], line 64
    bra = cursor;
    return true;
}

private boolean r_remove_category_2() {
    int among_var;
    // (, line 69
    // [, line 70
    ket = cursor;
    // substring, line 70
    among_var = find_among_b(a_2);
    if (among_var == 0)
    {
        return false;
    }
    // ], line 70
    bra = cursor;
    switch (among_var) {
        case 0:
            return false;
        case 1:
            // (, line 71
            // or, line 71
            lab0: do {
                int v_1 = limit - cursor;
                lab1: do {
                    // literal, line 71
                    if (!(eq_s_b("\u092F\u094C")))
                    {
                        break lab1;
                    }
                    break lab0;
                } while (false);
                cursor = limit - v_1;
                lab2: do {
                    // literal, line 71
                    if (!(eq_s_b("\u091B\u094C")))
                    {
                        break lab2;
                    }
                    break lab0;
                } while (false);
                cursor = limit - v_1;
                lab3: do {
                    // literal, line 71
                    if (!(eq_s_b("\u0928\u094C")))
                    {
                        break lab3;
                    }
                    break lab0;
                } while (false);
                cursor = limit - v_1;
                // literal, line 71
                if (!(eq_s_b("\u0925\u0947")))
                {
                    return false;
                }
            } while (false);
            // delete, line 71
            slice_del();
            break;
        case 2:
            // (, line 72
            // literal, line 72
            if (!(eq_s_b("\u0924\u094D\u0930")))
            {
                return false;
            }
            // delete, line 72
            slice_del();
            break;
    }
    return true;
}

private boolean r_remove_category_3() {
    int among_var;
    // (, line 76
    // [, line 77
    ket = cursor;
    // substring, line 77
    among_var = find_among_b(a_3);
    if (among_var == 0)
    {
        return false;
    }
    // ], line 77
    bra = cursor;
    switch (among_var) {
        case 0:
            return false;
        case 1:
            // (, line 79
            // delete, line 79
            slice_del();
            break;
    }
    return true;
}

public boolean stem() {
    // (, line 85
    // backwards, line 86
    limit_backward = cursor;
    cursor = limit;
    // (, line 86
    // do, line 87
    int v_1 = limit - cursor;
    lab0: do {
        // call remove_category_1, line 87
        if (!r_remove_category_1())
        {
            break lab0;
        }
    } while (false);
    cursor = limit - v_1;
    // do, line 88
    int v_2 = limit - cursor;
    lab1: do {
        // (, line 88
        // repeat, line 89
        replab2: while(true)
        {
            int v_3 = limit - cursor;
            lab3: do {
                // (, line 89
                // or, line 89
                lab4: do {
                    int v_4 = limit - cursor;
                    lab5: do {
                        // and, line 89
                        int v_5 = limit - cursor;
                        // call check_category_2, line 89
                        if (!r_check_category_2())
                        {
                            break lab5;
                        }
                        cursor = limit - v_5;
                        // call remove_category_2, line 89
                        if (!r_remove_category_2())
                        {
                            break lab5;
                        }
                        cursor = limit - v_5;
                        // call remove_category_3, line 89
                        if (!r_remove_category_3())
                        {
                            break lab5;
                        }
                        break lab4;
                    } while (false);
                    cursor = limit - v_4;
                    // call remove_category_3, line 89
                    if (!r_remove_category_3())
                    {
                        break lab3;
                    }
                } while (false);
                continue replab2;
            } while (false);
            cursor = limit - v_3;
            break replab2;
        }
    } while (false);
    cursor = limit - v_2;
    cursor = limit_backward;
    return true;
}

public boolean equals( Object o ) {
    return o instanceof nepaliStemmer;
}

public int hashCode() {
    return nepaliStemmer.class.getName().hashCode();
}



}

