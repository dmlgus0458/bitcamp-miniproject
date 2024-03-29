package com.bit.auction.goods.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAuction is a Querydsl query type for Auction
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAuction extends EntityPathBase<Auction> {

    private static final long serialVersionUID = -1324647543L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAuction auction = new QAuction("auction");

    public final ListPath<AuctionImg, QAuctionImg> auctionImgList = this.<AuctionImg, QAuctionImg>createList("auctionImgList", AuctionImg.class, QAuctionImg.class, PathInits.DIRECT2);

    public final QCategory category;

    public final NumberPath<Integer> currentBiddingPrice = createNumber("currentBiddingPrice", Integer.class);

    public final StringPath description = createString("description");

    public final DateTimePath<java.time.LocalDateTime> endDate = createDateTime("endDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> immediatePrice = createNumber("immediatePrice", Integer.class);

    public final NumberPath<Long> likeCnt = createNumber("likeCnt", Long.class);

    public final DateTimePath<java.time.LocalDateTime> regDate = createDateTime("regDate", java.time.LocalDateTime.class);

    public final com.bit.auction.user.entity.QUser regUser;

    public final NumberPath<Integer> startingPrice = createNumber("startingPrice", Integer.class);

    public final ComparablePath<Character> status = createComparable("status", Character.class);

    public final StringPath successfulBidderId = createString("successfulBidderId");

    public final StringPath target = createString("target");

    public final StringPath title = createString("title");

    public final NumberPath<Integer> view = createNumber("view", Integer.class);

    public QAuction(String variable) {
        this(Auction.class, forVariable(variable), INITS);
    }

    public QAuction(Path<? extends Auction> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAuction(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAuction(PathMetadata metadata, PathInits inits) {
        this(Auction.class, metadata, inits);
    }

    public QAuction(Class<? extends Auction> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.category = inits.isInitialized("category") ? new QCategory(forProperty("category"), inits.get("category")) : null;
        this.regUser = inits.isInitialized("regUser") ? new com.bit.auction.user.entity.QUser(forProperty("regUser")) : null;
    }

}

