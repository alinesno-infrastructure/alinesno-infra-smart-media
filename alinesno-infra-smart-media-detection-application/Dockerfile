# 基于Python镜像构建Docker容器
FROM python:3.9

# 设置工作目录
WORKDIR /app

# 复制所需文件到容器中
COPY requirements.txt .
COPY restapi.py .

# 安装依赖包
RUN pip install --no-cache-dir -r requirements.txt

# 暴露端口
EXPOSE 5001

# 运行应用
CMD ["python3", "restapi.py", "--port", "5001"]

