// This file was generated automatically by the Snowball to Java compiler
// http://snowballstem.org/

package org.tartarus.snowball.ext;

import org.tartarus.snowball.Among;

 /**
  * This class was automatically generated by a Snowball to Java compiler
  * It implements the stemming algorithm defined by a snowball script.
  */

public class finnishStemmer extends org.tartarus.snowball.SnowballStemmer {

    private static final long serialVersionUID = 1L;

private final static Among a_0[] = {
    new Among("pa", -1, 1),
    new Among("sti", -1, 2),
    new Among("kaan", -1, 1),
    new Among("han", -1, 1),
    new Among("kin", -1, 1),
    new Among("h\u00E4n", -1, 1),
    new Among("k\u00E4\u00E4n", -1, 1),
    new Among("ko", -1, 1),
    new Among("p\u00E4", -1, 1),
    new Among("k\u00F6", -1, 1)
};

private final static Among a_1[] = {
    new Among("lla", -1, -1),
    new Among("na", -1, -1),
    new Among("ssa", -1, -1),
    new Among("ta", -1, -1),
    new Among("lta", 3, -1),
    new Among("sta", 3, -1)
};

private final static Among a_2[] = {
    new Among("ll\u00E4", -1, -1),
    new Among("n\u00E4", -1, -1),
    new Among("ss\u00E4", -1, -1),
    new Among("t\u00E4", -1, -1),
    new Among("lt\u00E4", 3, -1),
    new Among("st\u00E4", 3, -1)
};

private final static Among a_3[] = {
    new Among("lle", -1, -1),
    new Among("ine", -1, -1)
};

private final static Among a_4[] = {
    new Among("nsa", -1, 3),
    new Among("mme", -1, 3),
    new Among("nne", -1, 3),
    new Among("ni", -1, 2),
    new Among("si", -1, 1),
    new Among("an", -1, 4),
    new Among("en", -1, 6),
    new Among("\u00E4n", -1, 5),
    new Among("ns\u00E4", -1, 3)
};

private final static Among a_5[] = {
    new Among("aa", -1, -1),
    new Among("ee", -1, -1),
    new Among("ii", -1, -1),
    new Among("oo", -1, -1),
    new Among("uu", -1, -1),
    new Among("\u00E4\u00E4", -1, -1),
    new Among("\u00F6\u00F6", -1, -1)
};

private final static Among a_6[] = {
    new Among("a", -1, 8),
    new Among("lla", 0, -1),
    new Among("na", 0, -1),
    new Among("ssa", 0, -1),
    new Among("ta", 0, -1),
    new Among("lta", 4, -1),
    new Among("sta", 4, -1),
    new Among("tta", 4, 2),
    new Among("lle", -1, -1),
    new Among("ine", -1, -1),
    new Among("ksi", -1, -1),
    new Among("n", -1, 7),
    new Among("han", 11, 1),
    new Among("den", 11, -1, "r_VI", finnishStemmer.class),
    new Among("seen", 11, -1, "r_LONG", finnishStemmer.class),
    new Among("hen", 11, 2),
    new Among("tten", 11, -1, "r_VI", finnishStemmer.class),
    new Among("hin", 11, 3),
    new Among("siin", 11, -1, "r_VI", finnishStemmer.class),
    new Among("hon", 11, 4),
    new Among("h\u00E4n", 11, 5),
    new Among("h\u00F6n", 11, 6),
    new Among("\u00E4", -1, 8),
    new Among("ll\u00E4", 22, -1),
    new Among("n\u00E4", 22, -1),
    new Among("ss\u00E4", 22, -1),
    new Among("t\u00E4", 22, -1),
    new Among("lt\u00E4", 26, -1),
    new Among("st\u00E4", 26, -1),
    new Among("tt\u00E4", 26, 2)
};

private final static Among a_7[] = {
    new Among("eja", -1, -1),
    new Among("mma", -1, 1),
    new Among("imma", 1, -1),
    new Among("mpa", -1, 1),
    new Among("impa", 3, -1),
    new Among("mmi", -1, 1),
    new Among("immi", 5, -1),
    new Among("mpi", -1, 1),
    new Among("impi", 7, -1),
    new Among("ej\u00E4", -1, -1),
    new Among("mm\u00E4", -1, 1),
    new Among("imm\u00E4", 10, -1),
    new Among("mp\u00E4", -1, 1),
    new Among("imp\u00E4", 12, -1)
};

private final static Among a_8[] = {
    new Among("i", -1, -1),
    new Among("j", -1, -1)
};

private final static Among a_9[] = {
    new Among("mma", -1, 1),
    new Among("imma", 0, -1)
};

private static final char g_AEI[] = {17, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8 };

private static final char g_C[] = {119, 223, 119, 1 };

private static final char g_V1[] = {17, 65, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 32 };

private static final char g_V2[] = {17, 65, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 32 };

private static final char g_particle_end[] = {17, 97, 24, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 32 };

private boolean B_ending_removed;
private java.lang.StringBuilder S_x = new java.lang.StringBuilder();
private int I_p2;
private int I_p1;


private boolean r_mark_regions() {
    // (, line 42
    I_p1 = limit;
    I_p2 = limit;
    // goto, line 47
    golab0: while(true)
    {
        int v_1 = cursor;
        lab1: do {
            if (!(in_grouping(g_V1, 97, 246)))
            {
                break lab1;
            }
            cursor = v_1;
            break golab0;
        } while (false);
        cursor = v_1;
        if (cursor >= limit)
        {
            return false;
        }
        cursor++;
    }
    // gopast, line 47
    golab2: while(true)
    {
        lab3: do {
            if (!(out_grouping(g_V1, 97, 246)))
            {
                break lab3;
            }
            break golab2;
        } while (false);
        if (cursor >= limit)
        {
            return false;
        }
        cursor++;
    }
    // setmark p1, line 47
    I_p1 = cursor;
    // goto, line 48
    golab4: while(true)
    {
        int v_3 = cursor;
        lab5: do {
            if (!(in_grouping(g_V1, 97, 246)))
            {
                break lab5;
            }
            cursor = v_3;
            break golab4;
        } while (false);
        cursor = v_3;
        if (cursor >= limit)
        {
            return false;
        }
        cursor++;
    }
    // gopast, line 48
    golab6: while(true)
    {
        lab7: do {
            if (!(out_grouping(g_V1, 97, 246)))
            {
                break lab7;
            }
            break golab6;
        } while (false);
        if (cursor >= limit)
        {
            return false;
        }
        cursor++;
    }
    // setmark p2, line 48
    I_p2 = cursor;
    return true;
}

private boolean r_R2() {
    if (!(I_p2 <= cursor))
    {
        return false;
    }
    return true;
}

private boolean r_particle_etc() {
    int among_var;
    // (, line 55
    // setlimit, line 56
    int v_1 = limit - cursor;
    // tomark, line 56
    if (cursor < I_p1)
    {
        return false;
    }
    cursor = I_p1;
    int v_2 = limit_backward;
    limit_backward = cursor;
    cursor = limit - v_1;
    // (, line 56
    // [, line 56
    ket = cursor;
    // substring, line 56
    among_var = find_among_b(a_0);
    if (among_var == 0)
    {
        limit_backward = v_2;
        return false;
    }
    // ], line 56
    bra = cursor;
    limit_backward = v_2;
    switch (among_var) {
        case 0:
            return false;
        case 1:
            // (, line 63
            if (!(in_grouping_b(g_particle_end, 97, 246)))
            {
                return false;
            }
            break;
        case 2:
            // (, line 65
            // call R2, line 65
            if (!r_R2())
            {
                return false;
            }
            break;
    }
    // delete, line 67
    slice_del();
    return true;
}

private boolean r_possessive() {
    int among_var;
    // (, line 69
    // setlimit, line 70
    int v_1 = limit - cursor;
    // tomark, line 70
    if (cursor < I_p1)
    {
        return false;
    }
    cursor = I_p1;
    int v_2 = limit_backward;
    limit_backward = cursor;
    cursor = limit - v_1;
    // (, line 70
    // [, line 70
    ket = cursor;
    // substring, line 70
    among_var = find_among_b(a_4);
    if (among_var == 0)
    {
        limit_backward = v_2;
        return false;
    }
    // ], line 70
    bra = cursor;
    limit_backward = v_2;
    switch (among_var) {
        case 0:
            return false;
        case 1:
            // (, line 73
            // not, line 73
            {
                int v_3 = limit - cursor;
                lab0: do {
                    // literal, line 73
                    if (!(eq_s_b("k")))
                    {
                        break lab0;
                    }
                    return false;
                } while (false);
                cursor = limit - v_3;
            }
            // delete, line 73
            slice_del();
            break;
        case 2:
            // (, line 75
            // delete, line 75
            slice_del();
            // [, line 75
            ket = cursor;
            // literal, line 75
            if (!(eq_s_b("kse")))
            {
                return false;
            }
            // ], line 75
            bra = cursor;
            // <-, line 75
            slice_from("ksi");
            break;
        case 3:
            // (, line 79
            // delete, line 79
            slice_del();
            break;
        case 4:
            // (, line 82
            // among, line 82
            if (find_among_b(a_1) == 0)
            {
                return false;
            }
            // delete, line 82
            slice_del();
            break;
        case 5:
            // (, line 84
            // among, line 84
            if (find_among_b(a_2) == 0)
            {
                return false;
            }
            // delete, line 85
            slice_del();
            break;
        case 6:
            // (, line 87
            // among, line 87
            if (find_among_b(a_3) == 0)
            {
                return false;
            }
            // delete, line 87
            slice_del();
            break;
    }
    return true;
}

public boolean r_LONG() {
    // among, line 92
    if (find_among_b(a_5) == 0)
    {
        return false;
    }
    return true;
}

public boolean r_VI() {
    // (, line 94
    // literal, line 94
    if (!(eq_s_b("i")))
    {
        return false;
    }
    if (!(in_grouping_b(g_V2, 97, 246)))
    {
        return false;
    }
    return true;
}

private boolean r_case_ending() {
    int among_var;
    // (, line 96
    // setlimit, line 97
    int v_1 = limit - cursor;
    // tomark, line 97
    if (cursor < I_p1)
    {
        return false;
    }
    cursor = I_p1;
    int v_2 = limit_backward;
    limit_backward = cursor;
    cursor = limit - v_1;
    // (, line 97
    // [, line 97
    ket = cursor;
    // substring, line 97
    among_var = find_among_b(a_6);
    if (among_var == 0)
    {
        limit_backward = v_2;
        return false;
    }
    // ], line 97
    bra = cursor;
    limit_backward = v_2;
    switch (among_var) {
        case 0:
            return false;
        case 1:
            // (, line 99
            // literal, line 99
            if (!(eq_s_b("a")))
            {
                return false;
            }
            break;
        case 2:
            // (, line 100
            // literal, line 100
            if (!(eq_s_b("e")))
            {
                return false;
            }
            break;
        case 3:
            // (, line 101
            // literal, line 101
            if (!(eq_s_b("i")))
            {
                return false;
            }
            break;
        case 4:
            // (, line 102
            // literal, line 102
            if (!(eq_s_b("o")))
            {
                return false;
            }
            break;
        case 5:
            // (, line 103
            // literal, line 103
            if (!(eq_s_b("\u00E4")))
            {
                return false;
            }
            break;
        case 6:
            // (, line 104
            // literal, line 104
            if (!(eq_s_b("\u00F6")))
            {
                return false;
            }
            break;
        case 7:
            // (, line 112
            // try, line 112
            int v_3 = limit - cursor;
            lab0: do {
                // (, line 112
                // and, line 114
                int v_4 = limit - cursor;
                // or, line 113
                lab1: do {
                    int v_5 = limit - cursor;
                    lab2: do {
                        // call LONG, line 112
                        if (!r_LONG())
                        {
                            break lab2;
                        }
                        break lab1;
                    } while (false);
                    cursor = limit - v_5;
                    // literal, line 113
                    if (!(eq_s_b("ie")))
                    {
                        cursor = limit - v_3;
                        break lab0;
                    }
                } while (false);
                cursor = limit - v_4;
                // next, line 114
                if (cursor <= limit_backward)
                {
                    cursor = limit - v_3;
                    break lab0;
                }
                cursor--;
                // ], line 114
                bra = cursor;
            } while (false);
            break;
        case 8:
            // (, line 120
            if (!(in_grouping_b(g_V1, 97, 246)))
            {
                return false;
            }
            if (!(in_grouping_b(g_C, 98, 122)))
            {
                return false;
            }
            break;
    }
    // delete, line 139
    slice_del();
    // set ending_removed, line 140
    B_ending_removed = true;
    return true;
}

private boolean r_other_endings() {
    int among_var;
    // (, line 142
    // setlimit, line 143
    int v_1 = limit - cursor;
    // tomark, line 143
    if (cursor < I_p2)
    {
        return false;
    }
    cursor = I_p2;
    int v_2 = limit_backward;
    limit_backward = cursor;
    cursor = limit - v_1;
    // (, line 143
    // [, line 143
    ket = cursor;
    // substring, line 143
    among_var = find_among_b(a_7);
    if (among_var == 0)
    {
        limit_backward = v_2;
        return false;
    }
    // ], line 143
    bra = cursor;
    limit_backward = v_2;
    switch (among_var) {
        case 0:
            return false;
        case 1:
            // (, line 147
            // not, line 147
            {
                int v_3 = limit - cursor;
                lab0: do {
                    // literal, line 147
                    if (!(eq_s_b("po")))
                    {
                        break lab0;
                    }
                    return false;
                } while (false);
                cursor = limit - v_3;
            }
            break;
    }
    // delete, line 152
    slice_del();
    return true;
}

private boolean r_i_plural() {
    // (, line 154
    // setlimit, line 155
    int v_1 = limit - cursor;
    // tomark, line 155
    if (cursor < I_p1)
    {
        return false;
    }
    cursor = I_p1;
    int v_2 = limit_backward;
    limit_backward = cursor;
    cursor = limit - v_1;
    // (, line 155
    // [, line 155
    ket = cursor;
    // substring, line 155
    if (find_among_b(a_8) == 0)
    {
        limit_backward = v_2;
        return false;
    }
    // ], line 155
    bra = cursor;
    limit_backward = v_2;
    // delete, line 159
    slice_del();
    return true;
}

private boolean r_t_plural() {
    int among_var;
    // (, line 161
    // setlimit, line 162
    int v_1 = limit - cursor;
    // tomark, line 162
    if (cursor < I_p1)
    {
        return false;
    }
    cursor = I_p1;
    int v_2 = limit_backward;
    limit_backward = cursor;
    cursor = limit - v_1;
    // (, line 162
    // [, line 163
    ket = cursor;
    // literal, line 163
    if (!(eq_s_b("t")))
    {
        limit_backward = v_2;
        return false;
    }
    // ], line 163
    bra = cursor;
    // test, line 163
    int v_3 = limit - cursor;
    if (!(in_grouping_b(g_V1, 97, 246)))
    {
        limit_backward = v_2;
        return false;
    }
    cursor = limit - v_3;
    // delete, line 164
    slice_del();
    limit_backward = v_2;
    // setlimit, line 166
    int v_4 = limit - cursor;
    // tomark, line 166
    if (cursor < I_p2)
    {
        return false;
    }
    cursor = I_p2;
    int v_5 = limit_backward;
    limit_backward = cursor;
    cursor = limit - v_4;
    // (, line 166
    // [, line 166
    ket = cursor;
    // substring, line 166
    among_var = find_among_b(a_9);
    if (among_var == 0)
    {
        limit_backward = v_5;
        return false;
    }
    // ], line 166
    bra = cursor;
    limit_backward = v_5;
    switch (among_var) {
        case 0:
            return false;
        case 1:
            // (, line 168
            // not, line 168
            {
                int v_6 = limit - cursor;
                lab0: do {
                    // literal, line 168
                    if (!(eq_s_b("po")))
                    {
                        break lab0;
                    }
                    return false;
                } while (false);
                cursor = limit - v_6;
            }
            break;
    }
    // delete, line 171
    slice_del();
    return true;
}

private boolean r_tidy() {
    // (, line 173
    // setlimit, line 174
    int v_1 = limit - cursor;
    // tomark, line 174
    if (cursor < I_p1)
    {
        return false;
    }
    cursor = I_p1;
    int v_2 = limit_backward;
    limit_backward = cursor;
    cursor = limit - v_1;
    // (, line 174
    // do, line 175
    int v_3 = limit - cursor;
    lab0: do {
        // (, line 175
        // and, line 175
        int v_4 = limit - cursor;
        // call LONG, line 175
        if (!r_LONG())
        {
            break lab0;
        }
        cursor = limit - v_4;
        // (, line 175
        // [, line 175
        ket = cursor;
        // next, line 175
        if (cursor <= limit_backward)
        {
            break lab0;
        }
        cursor--;
        // ], line 175
        bra = cursor;
        // delete, line 175
        slice_del();
    } while (false);
    cursor = limit - v_3;
    // do, line 176
    int v_5 = limit - cursor;
    lab1: do {
        // (, line 176
        // [, line 176
        ket = cursor;
        if (!(in_grouping_b(g_AEI, 97, 228)))
        {
            break lab1;
        }
        // ], line 176
        bra = cursor;
        if (!(in_grouping_b(g_C, 98, 122)))
        {
            break lab1;
        }
        // delete, line 176
        slice_del();
    } while (false);
    cursor = limit - v_5;
    // do, line 177
    int v_6 = limit - cursor;
    lab2: do {
        // (, line 177
        // [, line 177
        ket = cursor;
        // literal, line 177
        if (!(eq_s_b("j")))
        {
            break lab2;
        }
        // ], line 177
        bra = cursor;
        // or, line 177
        lab3: do {
            int v_7 = limit - cursor;
            lab4: do {
                // literal, line 177
                if (!(eq_s_b("o")))
                {
                    break lab4;
                }
                break lab3;
            } while (false);
            cursor = limit - v_7;
            // literal, line 177
            if (!(eq_s_b("u")))
            {
                break lab2;
            }
        } while (false);
        // delete, line 177
        slice_del();
    } while (false);
    cursor = limit - v_6;
    // do, line 178
    int v_8 = limit - cursor;
    lab5: do {
        // (, line 178
        // [, line 178
        ket = cursor;
        // literal, line 178
        if (!(eq_s_b("o")))
        {
            break lab5;
        }
        // ], line 178
        bra = cursor;
        // literal, line 178
        if (!(eq_s_b("j")))
        {
            break lab5;
        }
        // delete, line 178
        slice_del();
    } while (false);
    cursor = limit - v_8;
    limit_backward = v_2;
    // goto, line 180
    golab6: while(true)
    {
        int v_9 = limit - cursor;
        lab7: do {
            if (!(out_grouping_b(g_V1, 97, 246)))
            {
                break lab7;
            }
            cursor = limit - v_9;
            break golab6;
        } while (false);
        cursor = limit - v_9;
        if (cursor <= limit_backward)
        {
            return false;
        }
        cursor--;
    }
    // [, line 180
    ket = cursor;
    if (!(in_grouping_b(g_C, 98, 122)))
    {
        return false;
    }
    // ], line 180
    bra = cursor;
    // -> x, line 180
    slice_to(S_x);
    // name x, line 180
    if (!(eq_s_b(S_x)))
    {
        return false;
    }
    // delete, line 180
    slice_del();
    return true;
}

public boolean stem() {
    // (, line 184
    // do, line 186
    int v_1 = cursor;
    lab0: do {
        // call mark_regions, line 186
        if (!r_mark_regions())
        {
            break lab0;
        }
    } while (false);
    cursor = v_1;
    // unset ending_removed, line 187
    B_ending_removed = false;
    // backwards, line 188
    limit_backward = cursor;
    cursor = limit;
    // (, line 188
    // do, line 189
    int v_2 = limit - cursor;
    lab1: do {
        // call particle_etc, line 189
        if (!r_particle_etc())
        {
            break lab1;
        }
    } while (false);
    cursor = limit - v_2;
    // do, line 190
    int v_3 = limit - cursor;
    lab2: do {
        // call possessive, line 190
        if (!r_possessive())
        {
            break lab2;
        }
    } while (false);
    cursor = limit - v_3;
    // do, line 191
    int v_4 = limit - cursor;
    lab3: do {
        // call case_ending, line 191
        if (!r_case_ending())
        {
            break lab3;
        }
    } while (false);
    cursor = limit - v_4;
    // do, line 192
    int v_5 = limit - cursor;
    lab4: do {
        // call other_endings, line 192
        if (!r_other_endings())
        {
            break lab4;
        }
    } while (false);
    cursor = limit - v_5;
    // or, line 193
    lab5: do {
        lab6: do {
            // (, line 193
            // Boolean test ending_removed, line 193
            if (!(B_ending_removed))
            {
                break lab6;
            }
            // do, line 193
            int v_7 = limit - cursor;
            lab7: do {
                // call i_plural, line 193
                if (!r_i_plural())
                {
                    break lab7;
                }
            } while (false);
            cursor = limit - v_7;
            break lab5;
        } while (false);
        // do, line 193
        int v_8 = limit - cursor;
        lab8: do {
            // call t_plural, line 193
            if (!r_t_plural())
            {
                break lab8;
            }
        } while (false);
        cursor = limit - v_8;
    } while (false);
    // do, line 194
    int v_9 = limit - cursor;
    lab9: do {
        // call tidy, line 194
        if (!r_tidy())
        {
            break lab9;
        }
    } while (false);
    cursor = limit - v_9;
    cursor = limit_backward;
    return true;
}

public boolean equals( Object o ) {
    return o instanceof finnishStemmer;
}

public int hashCode() {
    return finnishStemmer.class.getName().hashCode();
}



}

