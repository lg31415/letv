package cn.jpush.android.data;

import android.content.Context;
import cn.jpush.android.helpers.d;
import cn.jpush.android.helpers.g;
import cn.jpush.android.util.ai;

final class k extends Thread {
    private static final String[] z;
    final /* synthetic */ Context a;
    final /* synthetic */ int b;
    final /* synthetic */ i c;
    final /* synthetic */ i d;

    static {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
        /*
        r4 = 1;
        r1 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r2 = "o>!C$p0";
        r0 = -1;
        r5 = r3;
        r6 = r3;
        r3 = r1;
    L_0x000b:
        r2 = r2.toCharArray();
        r7 = r2.length;
        if (r7 > r4) goto L_0x0057;
    L_0x0012:
        r8 = r1;
    L_0x0013:
        r9 = r2;
        r10 = r8;
        r13 = r7;
        r7 = r2;
        r2 = r13;
    L_0x0018:
        r12 = r7[r8];
        r11 = r10 % 5;
        switch(r11) {
            case 0: goto L_0x004b;
            case 1: goto L_0x004e;
            case 2: goto L_0x0051;
            case 3: goto L_0x0054;
            default: goto L_0x001f;
        };
    L_0x001f:
        r11 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
    L_0x0021:
        r11 = r11 ^ r12;
        r11 = (char) r11;
        r7[r8] = r11;
        r8 = r10 + 1;
        if (r2 != 0) goto L_0x002d;
    L_0x0029:
        r7 = r9;
        r10 = r8;
        r8 = r2;
        goto L_0x0018;
    L_0x002d:
        r7 = r2;
        r2 = r9;
    L_0x002f:
        if (r7 > r8) goto L_0x0013;
    L_0x0031:
        r7 = new java.lang.String;
        r7.<init>(r2);
        r2 = r7.intern();
        switch(r0) {
            case 0: goto L_0x0046;
            default: goto L_0x003d;
        };
    L_0x003d:
        r5[r3] = r2;
        r0 = "o>!C$p4";
        r2 = r0;
        r3 = r4;
        r5 = r6;
        r0 = r1;
        goto L_0x000b;
    L_0x0046:
        r5[r3] = r2;
        z = r6;
        return;
    L_0x004b:
        r11 = 25;
        goto L_0x0021;
    L_0x004e:
        r11 = 87;
        goto L_0x0021;
    L_0x0051:
        r11 = 68;
        goto L_0x0021;
    L_0x0054:
        r11 = 52;
        goto L_0x0021;
    L_0x0057:
        r8 = r1;
        goto L_0x002f;
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.jpush.android.data.k.<clinit>():void");
    }

    k(i iVar, Context context, int i, i iVar2) {
        this.d = iVar;
        this.a = context;
        this.b = i;
        this.c = iVar2;
    }

    public final void run() {
        if (d.a(this.d.L.b)) {
            this.d.L.l = c.a(this.d.L.b, this.d.c, z[1], this.a);
        }
        if (d.a(this.d.L.h)) {
            this.d.L.m = c.a(this.d.L.h, this.d.c, z[0], this.a);
        }
        if (ai.a(this.d.L.l) || ai.a(this.d.L.m)) {
            g.a(this.d.c, 1014, this.a);
            return;
        }
        g.a(this.d.c, this.b, this.a);
        i.a(this.d, this.c, this.a);
    }
}
