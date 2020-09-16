FROM pedro1972/php-70-rhel7

RUN echo "<h1>Meu Dockerfile</h1>" > /opt/app-root/src/index.php

CMD ["container-entrypoint", "/usr/libexec/s2i/run"]
