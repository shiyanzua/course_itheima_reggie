package com.sea.reggie.dto;

import com.sea.reggie.entity.Setmeal;
import com.sea.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
