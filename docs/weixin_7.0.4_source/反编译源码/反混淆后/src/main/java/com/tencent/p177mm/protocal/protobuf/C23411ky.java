package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.ky */
public final class C23411ky extends bsr {
    public int Scene;
    public int fJT;
    public int vLZ;
    public int vOn;
    public SKBuiltinBuffer_t vOo;
    public int vOp;
    public int vOq;
    public int vOr;
    public int vOs;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(11723);
        C6092b c6092b;
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.vOo == null) {
                c6092b = new C6092b("Not all required fields were included: ImageBuffer");
                AppMethodBeat.m2505o(11723);
                throw c6092b;
            }
            if (this.BaseRequest != null) {
                c6093a.mo13479iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(c6093a);
            }
            c6093a.mo13480iz(2, this.vOn);
            if (this.vOo != null) {
                c6093a.mo13479iy(3, this.vOo.computeSize());
                this.vOo.writeFields(c6093a);
            }
            c6093a.mo13480iz(4, this.vOp);
            c6093a.mo13480iz(5, this.vOq);
            c6093a.mo13480iz(6, this.fJT);
            c6093a.mo13480iz(7, this.vOr);
            c6093a.mo13480iz(8, this.vLZ);
            c6093a.mo13480iz(9, this.vOs);
            c6093a.mo13480iz(10, this.Scene);
            AppMethodBeat.m2505o(11723);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = C6087a.m9557ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix += C6091a.m9572bs(2, this.vOn);
            if (this.vOo != null) {
                ix += C6087a.m9557ix(3, this.vOo.computeSize());
            }
            int bs = ((((((ix + C6091a.m9572bs(4, this.vOp)) + C6091a.m9572bs(5, this.vOq)) + C6091a.m9572bs(6, this.fJT)) + C6091a.m9572bs(7, this.vOr)) + C6091a.m9572bs(8, this.vLZ)) + C6091a.m9572bs(9, this.vOs)) + C6091a.m9572bs(10, this.Scene);
            AppMethodBeat.m2505o(11723);
            return bs;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            if (this.vOo == null) {
                c6092b = new C6092b("Not all required fields were included: ImageBuffer");
                AppMethodBeat.m2505o(11723);
                throw c6092b;
            }
            AppMethodBeat.m2505o(11723);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C23411ky c23411ky = (C23411ky) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            byte[] bArr;
            C6086a c6086a3;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        C7267hl c7267hl = new C7267hl();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = c7267hl.populateBuilderWithField(c6086a3, c7267hl, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c23411ky.BaseRequest = c7267hl;
                    }
                    AppMethodBeat.m2505o(11723);
                    return 0;
                case 2:
                    c23411ky.vOn = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(11723);
                    return 0;
                case 3:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        SKBuiltinBuffer_t sKBuiltinBuffer_t = new SKBuiltinBuffer_t();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = sKBuiltinBuffer_t.populateBuilderWithField(c6086a3, sKBuiltinBuffer_t, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c23411ky.vOo = sKBuiltinBuffer_t;
                    }
                    AppMethodBeat.m2505o(11723);
                    return 0;
                case 4:
                    c23411ky.vOp = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(11723);
                    return 0;
                case 5:
                    c23411ky.vOq = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(11723);
                    return 0;
                case 6:
                    c23411ky.fJT = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(11723);
                    return 0;
                case 7:
                    c23411ky.vOr = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(11723);
                    return 0;
                case 8:
                    c23411ky.vLZ = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(11723);
                    return 0;
                case 9:
                    c23411ky.vOs = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(11723);
                    return 0;
                case 10:
                    c23411ky.Scene = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(11723);
                    return 0;
                default:
                    AppMethodBeat.m2505o(11723);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(11723);
            return -1;
        }
    }
}
