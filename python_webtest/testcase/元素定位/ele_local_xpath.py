# -*- coding: utf-8 -*-
# @Time    : 2023/2/7 14:28
# @Author  : alvin
# @File    : ele_local_id.py
# @Software: PyCharm
import time

from selenium import webdriver
import  os

base_path = (os.path.dirname(os.path.dirname(__file__)))
dirver_path = os.path.join(base_path,"driver_path","chromedriver.exe")
print(base_path,dirver_path)

driver = webdriver.Chrome(executable_path=dirver_path)
#打开网址
driver.get("http://novel.hctestedu.com/")
#查找元素 可以通过判断 get_attribute("type") 来进行操作，输入框定位
search_input = driver.find_element_by_xpath("//*[@id='searchKey']")
driver.find_element_by_css_selector("#id")
driver.find_element_by_css_selector(".s_int")
driver.find_element_by_css_selector("#kw>div>#ko")

search_input.send_keys("房租交")
print("size--",search_input.size)
print("location--",search_input.location)

#点击搜索框
driver.find_element_by_id("btnSearch").click()
#6验证结果
assert driver.title == "全部作品_读书屋"
print("测试通过")
time.sleep(20)
driver.close()


