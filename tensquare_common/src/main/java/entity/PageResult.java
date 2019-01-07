package entity;

import java.util.List;

/**
 * @program: tensquare_parent
 * @description: 分页结果
 * @author: Ming.Li
 * @create: 2019-01-07 15:30
 **/
public class PageResult<T> {
    private Long total;
    private List<T> rows;

    public PageResult(Long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

}
