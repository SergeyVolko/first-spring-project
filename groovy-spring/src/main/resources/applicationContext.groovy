import com.example.groovyspring.controllers.HwController
import com.example.groovyspring.modells.FirstBean
import com.example.groovyspring.modells.PrototypeBean
import com.example.groovyspring.modells.RequestScopeBean
import com.example.groovyspring.modells.SecondBean

beans {
    // Определяем бин PrototypeBean
    prototypeBean(PrototypeBean) { bean ->
        bean.scope = 'prototype' // Указываем, что бин имеет прототипный скоуп
    }

    // Определяем бин SecondBean и внедряем зависимость от PrototypeBean
    secondBean(SecondBean) { bean ->
        bean.constructorArgs = [ref('prototypeBean')] // Внедрение зависимости через конструктор
    }

    firstBean(FirstBean) { bean ->
        bean.constructorArgs = [ref('prototypeBean')]
    }

    requestScopeBean(RequestScopeBean) { bean ->
        bean.scope = "request"
    }

    hwController(HwController)
}

