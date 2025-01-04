import com.example.groovyspring.modells.PrototypeBean
import com.example.groovyspring.modells.SecondBean

beans {
    // Определяем бин PrototypeBean
    prototypeBean(PrototypeBean) { bean ->
        bean.scope = 'prototype' // Указываем, что бин имеет прототипный скоуп
    }

    // Определяем бин SecondBean и внедряем зависимость от PrototypeBean
    secondBean(SecondBean) { bean ->
        bean.prototypeBean = ref('prototypeBean') // Внедрение зависимости
    }
}

