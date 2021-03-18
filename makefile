# 使用 Just 工具和 justfile 搭建 Java 项目

# 需要生成的 jar 包
jar_pkg := java_test.jar
# 项目的入口点
entry_point := main.helloworld
# 资源目录，存放图片，文档等资源
assert_dir := assert
# 源文件目录
source_dir := src
# 源文件
source_files := \
	generic/GameObject.java \
	generic/GameIterator.java \
	generic/Game.java \
	main/helloworld.java \

# 目标文件目录
target_dir := bin
# 依赖库目录
lib_dir := lib
# Java 编译器
JC := javac
# 编译选项
JFLAGS := -encoding UTF-8

vpath %.class ${target_dir}
vpath %.java ${source_dir}

build: $(source_files:.java=.class)

%.class: %.java
	@$(JC) -cp $(target_dir) -d $(target_dir) $(JFLAGS) $<

new:
	@mkdir -pv $(source_dir) $(target_dir) $(assert_dir) $(lib_dir)

clean:
	@rm -rf $(target_dir)/*

run: build
	@java -cp ${target_dir} $(entry_point)

jar:
	@jar cvfe $(jar_pkg) $(entry_point) -C ${target_dir} . ${assert_dir}