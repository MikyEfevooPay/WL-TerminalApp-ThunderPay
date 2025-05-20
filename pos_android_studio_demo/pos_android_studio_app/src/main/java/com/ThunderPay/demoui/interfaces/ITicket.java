package com.ThunderPay.demoui.interfaces;

import com.ThunderPay.demoui.utils.PRINT_TYPE;
import com.ThunderPay.demoui.utils.Ticket;

public interface ITicket {
    void onPrintFinished(boolean isSuccess, PRINT_TYPE print_type, TicketLayoutType layoutType);

    void onPrintError(boolean isSuccess, String status, PRINT_TYPE print_type, TicketLayoutType layoutType);

    TicketLayoutType getPrintLayout();

    void setTicketData(Ticket ticket);
}
