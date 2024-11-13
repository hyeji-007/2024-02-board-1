package com.green.board;

import com.green.board.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
/*
    @Service - 빈 등록(스프링에게 객체 생성을 대신 부탁하는 것), 서비스가 로직처리 담당. 로직처리가 있다면 여기서 처리한다.
               없으면 연결 작업만... 연결작업이 Controller와 Persistence(DB) 연결


    빈 등록: 스프링 컨테이너에게 객체 생성을 대리로 맡기는 것, 기본적으로
            싱글톤(객체 생성을 단 하나만 되게 하는 것)으로 객체화
 */

@Service //스프링에서 제공되는 애노테이션, 빈 등록
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper mapper;

//    public BoardService(BoardMapper mapper) {
//        this.mapper = mapper;
//    }

    public int insBoard(BoardInsReq p) {
        return mapper.insBoard(p);
    }

    public List<BoardSelRes> selBoardList() {
        return mapper.selBoardList();
    }

    public BoardSelOneRes selBoardOne(int p) {
        return mapper.selBoardOne(p);
    }

    public int updBoard(BoardUpdReq p) {
        return mapper.updBoard(p);
    }

    public int delBoard(BoardDelReq p) {
        return mapper.delBoard(p);
    }
}

