package com.green.nottodolist.data;

import com.green.nottodolist.data.model.DataMainVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class DataService {
    private final DataMapper mapper;

    public DataMainVo selDataMain(int memberId) {
        DataMainVo dm = DataMainVo.builder()
                .weeklyMoney(mapper.selWeeklyMoney(memberId))
                .weeklyTime(mapper.selWeeklyTime(memberId))
                .monthMoney(mapper.selMonthlyMoney(memberId))
                .monthTime(mapper.selMonthlyTime(memberId))
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
//   public List<DataMoneyVo> selMonthMoney(){
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
