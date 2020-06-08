## Tasking

### 常规商品
1. Given 未过保常规商品,Quality=10, SellLn=3, When 距离过期天数减1, Then SellLn=2, Quality=9
1. Given 未过保常规商品,Quality=0,  SellLn=3, When 距离过期天数减1, Then SellLn=2, Quality=0
1. Given 已过保常规商品,Quality=10,  SellLn=-1, When 距离过期天数减1, Then SellLn=-2, Quality=8
1. Given 已过保常规商品,Quality=1,  SellLn=-1, When 距离过期天数减1, Then SellLn=-2, Quality=0

### 后台门票
1. Given 未过保后台门票,Quality=10, SellLn=15, When 距离过期天数减1, Then SellLn=14, Quality=11
1. Given 未过保后台门票,Quality=10, SellLn=10, When 距离过期天数减1, Then SellLn=9, Quality=12
1. Given 未过保后台门票,Quality=10, SellLn=5, When 距离过期天数减1, Then SellLn=4, Quality=13
1. Given 未过保后台门票,Quality=10, SellLn=0, When 距离过期天数减1, Then SellLn=-1, Quality=0
1. Given 已过保常规商品,Quality=0,  SellLn=-1, When 距离过期天数减1, Then SellLn=-2, Quality=0
