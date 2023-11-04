package lotto.controller;

import lotto.model.Lotto;
import lotto.model.LottoTicketCreator;

import java.util.List;

public class LottoController {

    private final PurchaseController purchaseController = new PurchaseController();
    private final LottoPrintController lottoPrintController = new LottoPrintController();
    private final LottoTicketCreator ticketCreator = new LottoTicketCreator();

    public void start() {
        int purchaseAmount = purchaseController.getPurchaseAmount();
        List<Lotto> lotto = ticketCreator.createLottoTickets(purchaseAmount);

        lottoPrintController.handleLottoDisplay(lotto);
    }
}