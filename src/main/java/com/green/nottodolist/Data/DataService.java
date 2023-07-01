package com.green.nottodolist.Data;

import com.green.nottodolist.Data.model.DataMainVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class DataService {
    private final DataMapper mapper;

    public DataMainVo selDataMain(){

        DataMainVo dm = DataMainVo.builder()
                .weeklyMoney(mapper.selWeeklyMoney())
                .weeklyTime(mapper.selWeeklyTime())
                .monthMoney(mapper.selMonthMoney())
                .monthTime(mapper.selMonthTime())
                .lastMonthMoney(mapper.selLastMonthMoney())
                .lastMonthTime(mapper.selLastMonthTime())
                .build();
        return dm;
    }
//    public DataMainVo selWeeklyMoney(){
//        return mapper.selWeeklyMoney();
//    }
//    public DataMainVo selWeeklyTime(){
//        return mapper.selWeeklyTime();
//    }
//
//   public DataMainVo selMonthMoney(){
//        return mapper.selMonthMoney();
//    }
//    public DataMainVo selLastMonthMoney(){
//        return mapper.selLastMonthMoney();
//    }
//    DataMainVo selMonthTime(){
//        return mapper.selMonthTime();
//    }
//    DataMainVo selLastMonthTime(){
//        return mapper.selLastMonthTime();
//    }

}
