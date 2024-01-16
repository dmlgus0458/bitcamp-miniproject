package com.bit.auction.goods.api;

import com.bit.auction.goods.dto.BiddingRequestDTO;
import com.bit.auction.goods.service.BiddingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BiddingApiController {

    private final BiddingService biddingService;

    @PostMapping("/bidding")
    public void biddingPrice(@RequestBody final BiddingRequestDTO biddingRequestDTO) {
        biddingService.biddingPrice(biddingRequestDTO);
    }

}